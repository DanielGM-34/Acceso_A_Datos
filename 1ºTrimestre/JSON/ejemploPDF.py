
"""
Descargador de PDF - Resume Ranger
Script simple que solo requiere pegar la URL 
"""

from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.chrome import ChromeDriverManager
import time
from pathlib import Path


def descargar_pdf_resume_ranger(url):
    """
    Descarga el PDF de una página de Resume Ranger.
    Solo requiere pegar la URL completa.
    
    Args:
        url (str): URL completa de theresumeranger.com
    """
    
    # Crear carpeta de descargas si no existe
    carpeta_descargas = Path("descargas_pdf")
    carpeta_descargas.mkdir(exist_ok=True)
    
    # Configurar Chrome
    chrome_options = Options()
    prefs = {
        "download.default_directory": str(carpeta_descargas.resolve()),
        "download.prompt_for_download": False,
        "download.directory_upgrade": True,
        "safebrowsing.enabled": False,
        "plugins.always_open_pdf_externally": True,
    }
    
    chrome_options.add_experimental_option("prefs", prefs)
    chrome_options.add_argument("--no-sandbox")
    chrome_options.add_argument("--disable-dev-shm-usage")
    
    # Descomenta esta línea para ejecutar sin interfaz gráfica
    # chrome_options.add_argument("--headless")
    
    driver = None
    try:
        print("=" * 70)
        print("DESCARGADOR DE PDF - Resume Ranger")
        print("=" * 70)
        print(f"\n[*] Abriendo navegador...")
        
        # Crear instancia del driver
        driver = webdriver.Chrome(
            service=Service(ChromeDriverManager().install()),
            options=chrome_options
        )
        
        print(f"[*] Navegando a la página...")
        driver.get(url)
        
        print(f"[*] Esperando a que cargue el contenido...")
        time.sleep(3)
        
        # Intentar encontrar un botón de descarga
        selectores_botones = [
            "button.download",
            "button[data-action='download']",
            "a.download",
            "button[title*='Descargar']",
            "button[title*='Download']",
            ".btn-download",
            "[class*='download']",
        ]
        
        boton_encontrado = False
        for selector in selectores_botones:
            try:
                boton = WebDriverWait(driver, 2).until(
                    EC.element_to_be_clickable((By.CSS_SELECTOR, selector))
                )
                print(f"[✓] Botón encontrado: {selector}")
                boton.click()
                print(f"[*] Click realizado en el botón...")
                boton_encontrado = True
                break
            except:
                continue
        
        if not boton_encontrado:
            print(f"[!] No se encontró botón de descarga automático")
            print(f"[*] Buscando PDF en la página...")
            
            # Buscar enlaces PDF
            enlaces = driver.find_elements(By.TAG_NAME, "a")
            for enlace in enlaces:
                href = enlace.get_attribute("href")
                if href and ".pdf" in href.lower():
                    print(f"[✓] PDF encontrado: {href}")
                    driver.get(href)
                    print(f"[*] Abriendo PDF...")
                    boton_encontrado = True
                    break
        
        # Esperar a que se descargue
        print(f"[*] Esperando descarga...")
        time.sleep(5)
        
        if boton_encontrado:
            print(f"[✓] PDF descargado exitosamente en: {carpeta_descargas}")
        else:
            print(f"[!] No se pudo descargar automáticamente")
            print(f"[*] Intenta descargarlo manualmente desde la página abierta")
        
        # Mantener el navegador abierto 2 segundos más para ver el resultado
        time.sleep(2)
        
        return True
    
    except Exception as e:
        print(f"[✗] Error: {e}")
        return False
    
    finally:
        if driver:
            driver.quit()
        print("\n" + "=" * 70)


if __name__ == "__main__":
    # SOLO TIENES QUE CAMBIAR LA URL AQUI
    # Pega tu URL completa aquí:
    URL = "https://theresumeranger.com/es/resume/4437c673-e4e6-4519-8390-e9833cdf84fb/preview?userId=6754096e-b5fa-4b24-ab19-8aeffc2b3183"
    
    # Ejecutar descarga
    descargar_pdf_resume_ranger(URL)