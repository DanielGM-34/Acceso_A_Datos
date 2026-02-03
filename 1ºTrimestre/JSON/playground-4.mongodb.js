// MongoDB Playground
// Use Ctrl+Space inside a snippet or a string literal to trigger completions.

// The current database to use.
use("ProyectoMongoDBAcceso");

// db.createCollection('Usuarios');
// db.Usuarios.createIndex({ idUsuario: 1 }, { unique: true });

// db.Usuarios.insertOne({
//     idUsuario: "cedaJuanAlgar",
//     nombre: "Juan",
//     apellido: "Algar",
//     edad: 28,
//     matricula: 27.99, 
//     tipoPago:"MENSUAL",
//     avanzado:true,
//     gimnasio:{
//         idGimnasio:"SivBox2304",
//         nombre:"SivanaBox",
//         ubicacion:"Aveniva Cerrajeros 1234"
//     },
//     clases:[
//         {
//             idClase:"claseMMA01",
//             nombre:"MMA",
//             nombreMonitor:"Juan Espartero",
//             diaHora:"Lunes 18:00",
//             nivel:"PRINCIPIANTE" 
//         },
//         {
//             idClase:"claseYoga02",
//             nombre:"Yoga",
//             nombreMonitor:"Ana Lopez",
//             diaHora:"Miercoles 10:00",
//             nivel:"INTERMEDIO"
//         },
//         {
//            idClase:"claseCrossfit03",
//             nombre:"Crossfit",
//             nombreMonitor:"Carlos Perez",
//             diaHora:"Viernes 19:00",
//             "nivel":"AVANZADO"
//         }
//     ]
// }

// );

// db.Usuarios.insertMany([
//   {
//     "idUsuario": "phoenix_warrior_88",
//     "nombre": "Sara",
//     "apellido": "Vílchez",
//     "edad": 26,
//     "matricula": 29.99,
//     "tipoPago": "MENSUAL",
//     "avanzado": false,
//     "gimnasio": {
//       "idGimnasio": "SivBox2304",
//       "nombre": "FitZone Centro",
//       "ubicacion": "Calle Principal 123"
//     },
//     "clases": [
//       {
//         "idClase": "claseYoga01",
//         "nombre": "Yoga",
//         "nombreMonitor": "Ana López",
//         "diaHora": "Miércoles 10:00",
//         "nivel": "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     "idUsuario": "titan_muscle_42",
//     "nombre": "Luis",
//     "apellido": "Navarro",
//     "edad": 33,
//     "matricula": 48.50,
//     "tipoPago": "ANUAL",
//     "avanzado": true,
//     "gimnasio": {
//       "idGimnasio": "PowerFit5678",
//       "nombre": "PowerFit",
//       "ubicacion": "Avenida Diagonal 456"
//     },
//     "clases": [
//       {
//         "idClase": "claseCrossfit03",
//         "nombre": "Crossfit",
//         "nombreMonitor": "Carlos Pérez",
//         "diaHora": "Viernes 19:00",
//         "nivel": "AVANZADO"
//       }
//     ]
//   },
//   {
//     "idUsuario": "shadow_dancer_75",
//     "nombre": "Camila",
//     "apellido": "García",
//     "edad": 22,
//     "matricula": 31.75,
//     "tipoPago": "DIARIO",
//     "avanzado": false,
//     "gimnasio": {
//       "idGimnasio": "EliteGym9012",
//       "nombre": "Elite Gym",
//       "ubicacion": "Plaza Mayor 789"
//     },
//     "clases": [
//       {
//         "idClase": "claseMMA01",
//         "nombre": "MMA",
//         "nombreMonitor": "Juan Espartero",
//         "diaHora": "Lunes 18:00",
//         "nivel": "PRINCIPIANTE"
//       },
//       {
//         "idClase": "claseYoga02",
//         "nombre": "Yoga",
//         "nombreMonitor": "Ana López",
//         "diaHora": "Miércoles 10:00",
//         "nivel": "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     "idUsuario": "velocity_storm_51",
//     "nombre": "Jorge",
//     "apellido": "Ramos",
//     "edad": 29,
//     "matricula": 42.25,
//     "tipoPago": "MENSUAL",
//     "avanzado": true,
//     "gimnasio": {
//       "idGimnasio": "SivBox2304",
//       "nombre": "FitZone Centro",
//       "ubicacion": "Calle Principal 123"
//     },
//     "clases": [
//       {
//         "idClase": "claseCrossfit03",
//         "nombre": "Crossfit",
//         "nombreMonitor": "Carlos Pérez",
//         "diaHora": "Viernes 19:00",
//         "nivel": "AVANZADO"
//       }
//     ]
//   },
//   {
//     "idUsuario": "zenith_power_19",
//     "nombre": "Paola",
//     "apellido": "Morales",
//     "edad": 31,
//     "matricula": 37.99,
//     "tipoPago": "ANUAL",
//     "avanzado": false,
//     "gimnasio": {
//       "idGimnasio": "PowerFit5678",
//       "nombre": "PowerFit",
//       "ubicacion": "Avenida Diagonal 456"
//     },
//     "clases": [
//       {
//         "idClase": "claseMMA01",
//         "nombre": "MMA",
//         "nombreMonitor": "Juan Espartero",
//         "diaHora": "Lunes 18:00",
//         "nivel": "PRINCIPIANTE"
//       },
//       {
//         "idClase": "claseCrossfit03",
//         "nombre": "Crossfit",
//         "nombreMonitor": "Carlos Pérez",
//         "diaHora": "Viernes 19:00",
//         "nivel": "AVANZADO"
//       }
//     ]
//   }
// ]);

// db.Usuarios.insertMany([
//   {
//     idUsuario: "user01",
//     nombre: "Ana",
//     apellido: "Martínez",
//     edad: 25,
//     matricula: 29.99,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "Gym001",
//       nombre: "StrongBox",
//       ubicacion: "Calle Mayor 45"
//     },
//     clases: [
//       {
//         idClase: "claseYoga01",
//         nombre: "Yoga",
//         nombreMonitor: "Ana López",
//         diaHora: "Martes 10:00",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "user02",
//     nombre: "Luis",
//     apellido: "García",
//     edad: 32,
//     matricula: 49.99,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "Gym002",
//       nombre: "PowerFit",
//       ubicacion: "Avenida Libertad 12"
//     },
//     clases: [
//       {
//         idClase: "claseMMA02",
//         nombre: "MMA",
//         nombreMonitor: "Juan Espartero",
//         diaHora: "Jueves 18:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "user03",
//     nombre: "María",
//     apellido: "López",
//     edad: 28,
//     matricula: 39.99,
//     tipoPago: "DIARIO",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "Gym003",
//       nombre: "CrossZone",
//       ubicacion: "Plaza Nueva 7"
//     },
//     clases: [
//       {
//         idClase: "claseCrossfit03",
//         nombre: "Crossfit",
//         nombreMonitor: "Carlos Pérez",
//         diaHora: "Viernes 19:00",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "user04",
//     nombre: "Pedro",
//     apellido: "Sánchez",
//     edad: 40,
//     matricula: 59.99,
//     tipoPago: "MENSUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "Gym004",
//       nombre: "IronClub",
//       ubicacion: "Calle Sol 22"
//     },
//     clases: [
//       {
//         idClase: "claseBox04",
//         nombre: "Boxeo",
//         nombreMonitor: "Miguel Torres",
//         diaHora: "Lunes 20:00",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "user05",
//     nombre: "Lucía",
//     apellido: "Fernández",
//     edad: 22,
//     matricula: 19.99,
//     tipoPago: "ANUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "Gym005",
//       nombre: "FitLife",
//       ubicacion: "Camino Real 10"
//     },
//     clases: [
//       {
//         idClase: "clasePilates05",
//         nombre: "Pilates",
//         nombreMonitor: "Laura Gómez",
//         diaHora: "Miércoles 09:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "user06",
//     nombre: "Carlos",
//     apellido: "Ruiz",
//     edad: 35,
//     matricula: 44.99,
//     tipoPago: "DIARIO",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "Gym006",
//       nombre: "EnergyGym",
//       ubicacion: "Avenida Central 33"
//     },
//     clases: [
//       {
//         idClase: "claseSpin06",
//         nombre: "Spinning",
//         nombreMonitor: "Sergio Díaz",
//         diaHora: "Viernes 18:00",
//         nivel: "AVANZADO"
//       }
//     ]
//   }
// ]);


// db.Usuarios.insertMany([
//   {
//     idUsuario: "phoenix_rider_101",
//     nombre: "Carlos",
//     apellido: "Ruiz",
//     edad: 35,
//     matricula: 44.99,
//     tipoPago: "DIARIO",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymFenix101",
//       nombre: "EnergyGym",
//       ubicacion: "Avenida Central 33"
//     },
//     clases: [
//       {
//         idClase: "claseSpin101",
//         nombre: "Spinning",
//         nombreMonitor: "Sergio Díaz",
//         diaHora: "Viernes 18:00",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "lunar_shadow_102",
//     nombre: "Ana",
//     apellido: "Gómez",
//     edad: 28,
//     matricula: 30.75,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymLunar102",
//       nombre: "FlexZone",
//       ubicacion: "Calle Norte 45"
//     },
//     clases: [
//       {
//         idClase: "claseYoga102",
//         nombre: "Yoga",
//         nombreMonitor: "Laura Pérez",
//         diaHora: "Martes 19:00",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "thunder_strike_103",
//     nombre: "Pedro",
//     apellido: "López",
//     edad: 32,
//     matricula: 48.25,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymThunder103",
//       nombre: "IronPeak",
//       ubicacion: "Avenida Sur 67"
//     },
//     clases: [
//       {
//         idClase: "clasePesas103",
//         nombre: "Pesas",
//         nombreMonitor: "Miguel Torres",
//         diaHora: "Lunes 20:00",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "crimson_wolf_104",
//     nombre: "María",
//     apellido: "Sánchez",
//     edad: 26,
//     matricula: 25.50,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymCrimson104",
//       nombre: "ZenFit",
//       ubicacion: "Plaza Centro 12"
//     },
//     clases: [
//       {
//         idClase: "clasePilates104",
//         nombre: "Pilates",
//         nombreMonitor: "Sara Vega",
//         diaHora: "Miércoles 18:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "iron_hawk_105",
//     nombre: "Luis",
//     apellido: "Martín",
//     edad: 29,
//     matricula: 35.20,
//     tipoPago: "DIARIO",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymIron105",
//       nombre: "TitanGym",
//       ubicacion: "Calle Este 89"
//     },
//     clases: [
//       {
//         idClase: "claseCross105",
//         nombre: "Crossfit",
//         nombreMonitor: "David Ruiz",
//         diaHora: "Jueves 19:30",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "silver_fox_106",
//     nombre: "Elena",
//     apellido: "Moreno",
//     edad: 31,
//     matricula: 42.45,
//     tipoPago: "ANUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymSilver106",
//       nombre: "VitalFit",
//       ubicacion: "Avenida Oeste 21"
//     },
//     clases: [
//       {
//         idClase: "claseZumba106",
//         nombre: "Zumba",
//         nombreMonitor: "Carmen Soto",
//         diaHora: "Sábado 10:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   }
// ]);

// db.Usuarios.insertMany([
//   {
//     idUsuario: "neon_dragon_107",
//     nombre: "Javier",
//     apellido: "Ramos",
//     edad: 27,
//     matricula: 29.80,
//     tipoPago: "MENSUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymNeon107",
//       nombre: "Neon Dragon",
//       ubicacion: "Calle Neon 107"
//     },
//     clases: [
//       {
//         idClase: "claseHIIT107",
//         nombre: "HIIT",
//         nombreMonitor: "Javier Cruz",
//         diaHora: "Lunes 18:30",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "shadow_blade_108",
//     nombre: "Sofía",
//     apellido: "Navarro",
//     edad: 24,
//     matricula: 26.90,
//     tipoPago: "DIARIO",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymShadow108",
//       nombre: "Shadow Blade",
//       ubicacion: "Avenida Oscura 108"
//     },
//     clases: [
//       {
//         idClase: "claseBoxeo108",
//         nombre: "Boxeo",
//         nombreMonitor: "Sofía Bravo",
//         diaHora: "Martes 20:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "storm_rider_109",
//     nombre: "Diego",
//     apellido: "Fernández",
//     edad: 33,
//     matricula: 51.25,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymStorm109",
//       nombre: "Storm Rider",
//       ubicacion: "Plaza Tormenta 109"
//     },
//     clases: [
//       {
//         idClase: "claseMMA109",
//         nombre: "MMA",
//         nombreMonitor: "Diego Guerra",
//         diaHora: "Miércoles 19:45",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "golden_eagle_110",
//     nombre: "Paula",
//     apellido: "Cortés",
//     edad: 29,
//     matricula: 33.60,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymGolden110",
//       nombre: "Golden Eagle",
//       ubicacion: "Calle Águila 110"
//     },
//     clases: [
//       {
//         idClase: "clasePilates110",
//         nombre: "Pilates Avanzado",
//         nombreMonitor: "Paula Luna",
//         diaHora: "Jueves 17:30",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "fire_phoenix_111",
//     nombre: "Raúl",
//     apellido: "Valdés",
//     edad: 30,
//     matricula: 39.95,
//     tipoPago: "MENSUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymFire111",
//       nombre: "Fire Phoenix",
//       ubicacion: "Avenida Fuego 111"
//     },
//     clases: [
//       {
//         idClase: "claseCross111",
//         nombre: "Crossfit Elite",
//         nombreMonitor: "Raúl Salazar",
//         diaHora: "Viernes 20:30",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "ice_wyvern_112",
//     nombre: "Carmen",
//     apellido: "Ríos",
//     edad: 25,
//     matricula: 28.10,
//     tipoPago: "DIARIO",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymIce112",
//       nombre: "Ice Wyvern",
//       ubicacion: "Plaza Hielo 112"
//     },
//     clases: [
//       {
//         idClase: "claseZumba112",
//         nombre: "Zumba Fitness",
//         nombreMonitor: "Carmen Alba",
//         diaHora: "Sábado 11:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "dark_titan_113",
//     nombre: "Gabriel",
//     apellido: "Nieto",
//     edad: 36,
//     matricula: 58.75,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymDark113",
//       nombre: "Dark Titan",
//       ubicacion: "Calle Titán 113"
//     },
//     clases: [
//       {
//         idClase: "clasePower113",
//         nombre: "Powerlifting",
//         nombreMonitor: "Gabriel Force",
//         diaHora: "Domingo 10:30",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "crystal_serpent_114",
//     nombre: "Lorena",
//     apellido: "Guerrero",
//     edad: 27,
//     matricula: 31.40,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymCrystal114",
//       nombre: "Crystal Serpent",
//       ubicacion: "Avenida Cristal 114"
//     },
//     clases: [
//       {
//         idClase: "claseYoga114",
//         nombre: "Yoga Restaurativo",
//         nombreMonitor: "Lorena Paz",
//         diaHora: "Lunes 09:30",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "plasma_hunter_115",
//     nombre: "Emilio",
//     apellido: "Paredes",
//     edad: 32,
//     matricula: 47.30,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymPlasma115",
//       nombre: "Plasma Hunter",
//       ubicacion: "Calle Plasma 115"
//     },
//     clases: [
//       {
//         idClase: "claseKettle115",
//         nombre: "Kettlebell",
//         nombreMonitor: "Emilio Storm",
//         diaHora: "Martes 19:00",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   },
//   {
//     idUsuario: "violet_phantom_116",
//     nombre: "Noelia",
//     apellido: "Sáez",
//     edad: 23,
//     matricula: 24.85,
//     tipoPago: "DIARIO",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymViolet116",
//       nombre: "Violet Phantom",
//       ubicacion: "Plaza Violeta 116"
//     },
//     clases: [
//       {
//         idClase: "claseTRX116",
//         nombre: "TRX",
//         nombreMonitor: "Noelia Flow",
//         diaHora: "Miércoles 18:00",
//         nivel: "PRINCIPIANTE"
//       }
//     ]
//   },
//   {
//     idUsuario: "onyx_beast_117",
//     nombre: "Tomás",
//     apellido: "León",
//     edad: 34,
//     matricula: 53.90,
//     tipoPago: "ANUAL",
//     avanzado: true,
//     gimnasio: {
//       idGimnasio: "GymOnyx117",
//       nombre: "Onyx Beast",
//       ubicacion: "Avenida Ónix 117"
//     },
//     clases: [
//       {
//         idClase: "claseStrong117",
//         nombre: "Strongman",
//         nombreMonitor: "Tomás Iron",
//         diaHora: "Jueves 21:00",
//         nivel: "AVANZADO"
//       }
//     ]
//   },
//   {
//     idUsuario: "emerald_stalker_118",
//     nombre: "Almudena",
//     apellido: "Paz",
//     edad: 28,
//     matricula: 36.15,
//     tipoPago: "MENSUAL",
//     avanzado: false,
//     gimnasio: {
//       idGimnasio: "GymEmerald118",
//       nombre: "Emerald Stalker",
//       ubicacion: "Calle Esmeralda 118"
//     },
//     clases: [
//       {
//         idClase: "claseBarre118",
//         nombre: "Barre",
//         nombreMonitor: "Almudena Grace",
//         diaHora: "Viernes 18:30",
//         nivel: "INTERMEDIO"
//       }
//     ]
//   }
// ]);

db.Usuarios.insertMany([
{
idUsuario: "cedaJuanAlgar",
nombre: "Juan",
apellido: "Algar",
edad: 28,
matricula: 27.99,
tipoPago: "MENSUAL",
avanzado: true,
gimnasio: {
idGimnasio: "SivBox2304",
nombre: "SivanaBox",
ubicacion: "Aveniva Cerrajeros 1234"
},
clases: [
{
idClase: "claseMMA01",
nombre: "MMA",
nombreMonitor: "Juan Espartero",
diaHora: "Lunes 18:00",
nivel: "PRINCIPIANTE"
},
{
idClase: "claseYoga02",
nombre: "Yoga",
nombreMonitor: "Ana Lopez",
diaHora: "Miercoles 10:00",
nivel: "INTERMEDIO"
},
{
idClase: "claseCrossfit03",
nombre: "Crossfit",
nombreMonitor: "Carlos Perez",
diaHora: "Viernes 19:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "phoenix_warrior_88",
nombre: "Sara",
apellido: "Vílchez",
edad: 26,
matricula: 29.99,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "SivBox2304",
nombre: "FitZone Centro",
ubicacion: "Calle Principal 123"
},
clases: [
{
idClase: "claseYoga01",
nombre: "Yoga",
nombreMonitor: "Ana López",
diaHora: "Miércoles 10:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "titan_muscle_42",
nombre: "Luis",
apellido: "Navarro",
edad: 33,
matricula: 48.50,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "PowerFit5678",
nombre: "PowerFit",
ubicacion: "Avenida Diagonal 456"
},
clases: [
{
idClase: "claseCrossfit03",
nombre: "Crossfit",
nombreMonitor: "Carlos Pérez",
diaHora: "Viernes 19:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "shadow_dancer_75",
nombre: "Camila",
apellido: "García",
edad: 22,
matricula: 31.75,
tipoPago: "DIARIO",
avanzado: false,
gimnasio: {
idGimnasio: "EliteGym9012",
nombre: "Elite Gym",
ubicacion: "Plaza Mayor 789"
},
clases: [
{
idClase: "claseMMA01",
nombre: "MMA",
nombreMonitor: "Juan Espartero",
diaHora: "Lunes 18:00",
nivel: "PRINCIPIANTE"
},
{
idClase: "claseYoga02",
nombre: "Yoga",
nombreMonitor: "Ana López",
diaHora: "Miércoles 10:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "velocity_storm_51",
nombre: "Jorge",
apellido: "Ramos",
edad: 29,
matricula: 42.25,
tipoPago: "MENSUAL",
avanzado: true,
gimnasio: {
idGimnasio: "SivBox2304",
nombre: "FitZone Centro",
ubicacion: "Calle Principal 123"
},
clases: [
{
idClase: "claseCrossfit03",
nombre: "Crossfit",
nombreMonitor: "Carlos Pérez",
diaHora: "Viernes 19:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "zenith_power_19",
nombre: "Paola",
apellido: "Morales",
edad: 31,
matricula: 37.99,
tipoPago: "ANUAL",
avanzado: false,
gimnasio: {
idGimnasio: "PowerFit5678",
nombre: "PowerFit",
ubicacion: "Avenida Diagonal 456"
},
clases: [
{
idClase: "claseMMA01",
nombre: "MMA",
nombreMonitor: "Juan Espartero",
diaHora: "Lunes 18:00",
nivel: "PRINCIPIANTE"
},
{
idClase: "claseCrossfit03",
nombre: "Crossfit",
nombreMonitor: "Carlos Pérez",
diaHora: "Viernes 19:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "user01",
nombre: "Ana",
apellido: "Martínez",
edad: 25,
matricula: 29.99,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "Gym001",
nombre: "StrongBox",
ubicacion: "Calle Mayor 45"
},
clases: [
{
idClase: "claseYoga01",
nombre: "Yoga",
nombreMonitor: "Ana López",
diaHora: "Martes 10:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "user02",
nombre: "Luis",
apellido: "García",
edad: 32,
matricula: 49.99,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "Gym002",
nombre: "PowerFit",
ubicacion: "Avenida Libertad 12"
},
clases: [
{
idClase: "claseMMA02",
nombre: "MMA",
nombreMonitor: "Juan Espartero",
diaHora: "Jueves 18:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "user03",
nombre: "María",
apellido: "López",
edad: 28,
matricula: 39.99,
tipoPago: "DIARIO",
avanzado: false,
gimnasio: {
idGimnasio: "Gym003",
nombre: "CrossZone",
ubicacion: "Plaza Nueva 7"
},
clases: [
{
idClase: "claseCrossfit03",
nombre: "Crossfit",
nombreMonitor: "Carlos Pérez",
diaHora: "Viernes 19:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "user04",
nombre: "Pedro",
apellido: "Sánchez",
edad: 40,
matricula: 59.99,
tipoPago: "MENSUAL",
avanzado: true,
gimnasio: {
idGimnasio: "Gym004",
nombre: "IronClub",
ubicacion: "Calle Sol 22"
},
clases: [
{
idClase: "claseBox04",
nombre: "Boxeo",
nombreMonitor: "Miguel Torres",
diaHora: "Lunes 20:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "user05",
nombre: "Lucía",
apellido: "Fernández",
edad: 22,
matricula: 19.99,
tipoPago: "ANUAL",
avanzado: false,
gimnasio: {
idGimnasio: "Gym005",
nombre: "FitLife",
ubicacion: "Camino Real 10"
},
clases: [
{
idClase: "clasePilates05",
nombre: "Pilates",
nombreMonitor: "Laura Gómez",
diaHora: "Miércoles 09:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "user06",
nombre: "Carlos",
apellido: "Ruiz",
edad: 35,
matricula: 44.99,
tipoPago: "DIARIO",
avanzado: true,
gimnasio: {
idGimnasio: "Gym006",
nombre: "EnergyGym",
ubicacion: "Avenida Central 33"
},
clases: [
{
idClase: "claseSpin06",
nombre: "Spinning",
nombreMonitor: "Sergio Díaz",
diaHora: "Viernes 18:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "phoenix_rider_101",
nombre: "Carlos",
apellido: "Ruiz",
edad: 35,
matricula: 44.99,
tipoPago: "DIARIO",
avanzado: true,
gimnasio: {
idGimnasio: "GymFenix101",
nombre: "EnergyGym",
ubicacion: "Avenida Central 33"
},
clases: [
{
idClase: "claseSpin101",
nombre: "Spinning",
nombreMonitor: "Sergio Díaz",
diaHora: "Viernes 18:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "lunar_shadow_102",
nombre: "Ana",
apellido: "Gómez",
edad: 28,
matricula: 30.75,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymLunar102",
nombre: "FlexZone",
ubicacion: "Calle Norte 45"
},
clases: [
{
idClase: "claseYoga102",
nombre: "Yoga",
nombreMonitor: "Laura Pérez",
diaHora: "Martes 19:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "thunder_strike_103",
nombre: "Pedro",
apellido: "López",
edad: 32,
matricula: 48.25,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymThunder103",
nombre: "IronPeak",
ubicacion: "Avenida Sur 67"
},
clases: [
{
idClase: "clasePesas103",
nombre: "Pesas",
nombreMonitor: "Miguel Torres",
diaHora: "Lunes 20:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "crimson_wolf_104",
nombre: "María",
apellido: "Sánchez",
edad: 26,
matricula: 25.50,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymCrimson104",
nombre: "ZenFit",
ubicacion: "Plaza Centro 12"
},
clases: [
{
idClase: "clasePilates104",
nombre: "Pilates",
nombreMonitor: "Sara Vega",
diaHora: "Miércoles 18:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "iron_hawk_105",
nombre: "Luis",
apellido: "Martín",
edad: 29,
matricula: 35.20,
tipoPago: "DIARIO",
avanzado: true,
gimnasio: {
idGimnasio: "GymIron105",
nombre: "TitanGym",
ubicacion: "Calle Este 89"
},
clases: [
{
idClase: "claseCross105",
nombre: "Crossfit",
nombreMonitor: "David Ruiz",
diaHora: "Jueves 19:30",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "silver_fox_106",
nombre: "Elena",
apellido: "Moreno",
edad: 31,
matricula: 42.45,
tipoPago: "ANUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymSilver106",
nombre: "VitalFit",
ubicacion: "Avenida Oeste 21"
},
clases: [
{
idClase: "claseZumba106",
nombre: "Zumba",
nombreMonitor: "Carmen Soto",
diaHora: "Sábado 10:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "neon_dragon_107",
nombre: "Javier",
apellido: "Ramos",
edad: 27,
matricula: 29.80,
tipoPago: "MENSUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymNeon107",
nombre: "Neon Dragon",
ubicacion: "Calle Neon 107"
},
clases: [
{
idClase: "claseHIIT107",
nombre: "HIIT",
nombreMonitor: "Javier Cruz",
diaHora: "Lunes 18:30",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "shadow_blade_108",
nombre: "Sofía",
apellido: "Navarro",
edad: 24,
matricula: 26.90,
tipoPago: "DIARIO",
avanzado: false,
gimnasio: {
idGimnasio: "GymShadow108",
nombre: "Shadow Blade",
ubicacion: "Avenida Oscura 108"
},
clases: [
{
idClase: "claseBoxeo108",
nombre: "Boxeo",
nombreMonitor: "Sofía Bravo",
diaHora: "Martes 20:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "storm_rider_109",
nombre: "Diego",
apellido: "Fernández",
edad: 33,
matricula: 51.25,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymStorm109",
nombre: "Storm Rider",
ubicacion: "Plaza Tormenta 109"
},
clases: [
{
idClase: "claseMMA109",
nombre: "MMA",
nombreMonitor: "Diego Guerra",
diaHora: "Miércoles 19:45",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "golden_eagle_110",
nombre: "Paula",
apellido: "Cortés",
edad: 29,
matricula: 33.60,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymGolden110",
nombre: "Golden Eagle",
ubicacion: "Calle Águila 110"
},
clases: [
{
idClase: "clasePilates110",
nombre: "Pilates Avanzado",
nombreMonitor: "Paula Luna",
diaHora: "Jueves 17:30",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "fire_phoenix_111",
nombre: "Raúl",
apellido: "Valdés",
edad: 30,
matricula: 39.95,
tipoPago: "MENSUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymFire111",
nombre: "Fire Phoenix",
ubicacion: "Avenida Fuego 111"
},
clases: [
{
idClase: "claseCross111",
nombre: "Crossfit Elite",
nombreMonitor: "Raúl Salazar",
diaHora: "Viernes 20:30",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "ice_wyvern_112",
nombre: "Carmen",
apellido: "Ríos",
edad: 25,
matricula: 28.10,
tipoPago: "DIARIO",
avanzado: false,
gimnasio: {
idGimnasio: "GymIce112",
nombre: "Ice Wyvern",
ubicacion: "Plaza Hielo 112"
},
clases: [
{
idClase: "claseZumba112",
nombre: "Zumba Fitness",
nombreMonitor: "Carmen Alba",
diaHora: "Sábado 11:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "dark_titan_113",
nombre: "Gabriel",
apellido: "Nieto",
edad: 36,
matricula: 58.75,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymDark113",
nombre: "Dark Titan",
ubicacion: "Calle Titán 113"
},
clases: [
{
idClase: "clasePower113",
nombre: "Powerlifting",
nombreMonitor: "Gabriel Force",
diaHora: "Domingo 10:30",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "crystal_serpent_114",
nombre: "Lorena",
apellido: "Guerrero",
edad: 27,
matricula: 31.40,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymCrystal114",
nombre: "Crystal Serpent",
ubicacion: "Avenida Cristal 114"
},
clases: [
{
idClase: "claseYoga114",
nombre: "Yoga Restaurativo",
nombreMonitor: "Lorena Paz",
diaHora: "Lunes 09:30",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "plasma_hunter_115",
nombre: "Emilio",
apellido: "Paredes",
edad: 32,
matricula: 47.30,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymPlasma115",
nombre: "Plasma Hunter",
ubicacion: "Calle Plasma 115"
},
clases: [
{
idClase: "claseKettle115",
nombre: "Kettlebell",
nombreMonitor: "Emilio Storm",
diaHora: "Martes 19:00",
nivel: "INTERMEDIO"
}
]
},
{
idUsuario: "violet_phantom_116",
nombre: "Noelia",
apellido: "Sáez",
edad: 23,
matricula: 24.85,
tipoPago: "DIARIO",
avanzado: false,
gimnasio: {
idGimnasio: "GymViolet116",
nombre: "Violet Phantom",
ubicacion: "Plaza Violeta 116"
},
clases: [
{
idClase: "claseTRX116",
nombre: "TRX",
nombreMonitor: "Noelia Flow",
diaHora: "Miércoles 18:00",
nivel: "PRINCIPIANTE"
}
]
},
{
idUsuario: "onyx_beast_117",
nombre: "Tomás",
apellido: "León",
edad: 34,
matricula: 53.90,
tipoPago: "ANUAL",
avanzado: true,
gimnasio: {
idGimnasio: "GymOnyx117",
nombre: "Onyx Beast",
ubicacion: "Avenida Ónix 117"
},
clases: [
{
idClase: "claseStrong117",
nombre: "Strongman",
nombreMonitor: "Tomás Iron",
diaHora: "Jueves 21:00",
nivel: "AVANZADO"
}
]
},
{
idUsuario: "emerald_stalker_118",
nombre: "Almudena",
apellido: "Paz",
edad: 28,
matricula: 36.15,
tipoPago: "MENSUAL",
avanzado: false,
gimnasio: {
idGimnasio: "GymEmerald118",
nombre: "Emerald Stalker",
ubicacion: "Calle Esmeralda 118"
},
clases: [
{
idClase: "claseBarre118",
nombre: "Barre",
nombreMonitor: "Almudena Grace",
diaHora: "Viernes 18:30",
nivel: "INTERMEDIO"
}
]
}
]);
