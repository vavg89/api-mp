# Test Manager Performance - Proyecto K6

<img src="docs/logo_crowdar.png" alt="Crowdar Logo" width="350" style="margin-right: 100px;" /> <img src="docs/logo_lippia.png" alt="Lippia Logo" width="250" style="float: right; margin-left: 100px;" />

## Instalación y Configuración

Para instalar y configurar el proyecto, sigue los siguientes pasos:

### Requisitos Previos

- Node.js (versión 14 o superior)
- npm (versión 6 o superior)

### Instalación

1. Clona el repositorio en tu máquina local:

   ```bash
   git clone <url_del_repositorio>
   cd test-manager-performance
   ```
2. Crea tu rama de trabajo:

   ```bash
   git checkout -b <nombre_de_tu_rama>
   ```

3. Instala las dependencias necesarias utilizando npm:

   ```bash
   npm install
   ```

### Instalación de k6 en Windows

#### Paso 1: Instalar Chocolatey Package Manager

Abre PowerShell como administrador y ejecuta el siguiente comando para instalar Chocolatey:

```bash
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

#### Paso 2: Instalar k6 con Chocolatey

Abre el símbolo del sistema (cmd) y ejecuta el siguiente comando para instalar k6:

```bash
choco install k6
```

#### Instalar Go

```bash
choco install golang
```

#### Instalar la actualización de K6

```bash
go install go.k6.io/xk6/cmd/xk6@latest
```

#### Hacer un build del proyecto en la consola

```bash
xk6 build --with github.com/grafana/xk6-browser@latest
```

#### Build with xk6

```bash
xk6 build --with github.com/grafana/xk6-output-influxdb
```

#### Paso 3: Instalar el plugin en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Ve a "File" -> "Settings" o usa el atajo Ctrl + Alt + S para abrir la configuración.
3. En la barra lateral izquierda, selecciona "Plugins".
4. Haz clic en "Marketplace" en la parte superior.
5. Busca "k6" en el cuadro de búsqueda.
6. Encuentra el plugin "k6" desarrollado por Load Impact y haz clic en "Install" para instalarlo.

#### Paso 4: Reiniciar IntelliJ IDEA

Una vez instalado el plugin, es necesario reiniciar IntelliJ IDEA para que los cambios surtan efecto. Cierra y vuelve a abrir IntelliJ IDEA.

### Configuración

1. Configura las variables de entorno necesarias en el archivo `.env` en la raíz del proyecto. Un ejemplo de archivo `.env` puede incluir:

   ```
   NODE_ENV=development
   API_URL=https://api.example.com
   AUTH_TOKEN=your_auth_token_here
   ```

2. Configura los perfiles de prueba en el archivo `config/config.js` según los requisitos de cada entorno (picos de carga, stress, spike, etc.).

## Estructura del Proyecto

La estructura del proyecto ha sido reorganizada de la siguiente manera:

```
project-root/
├── config/                         # Configuraciones generales del proyecto
│   └── config.js
├── scenarios/                      # Scripts de escenarios de prueba
│   ├── demoFront/                  # Pruebas para la UI de Frontend
│   │   └── demoFrontk6.js
│   └── backend/                    # Pruebas para la API y Backend
│       ├── demok6.js
├── services/                       # Servicios que interactúan con la API o bases de datos
│   ├── getProject.js
│   ├── getProjectLtm.js
│   └── postRunLtm.js
├── auth/                           # Módulo para autenticación
│   └── token.js
├── reports/                        # Generación de reportes
│   ├── html                        # Reportes en formato HTML
│   └── summaries                   # Resúmenes de ejecuciones de pruebas
├── utils/                          # Utilidades generales
│   └── testsCache                  # Almacenamiento de caché
├── docs/                           # Documentación del proyecto
├── package.json
├── package-lock.json
├── .gitlab-ci.yml
└── README.md
```

## Descripción de Carpetas y Archivos

- **config/**: Contiene las configuraciones generales del proyecto, como los perfiles de prueba (peakLoad, stress, spike, soak).
- **scenarios/**: Contiene scripts de prueba organizados por tipo (frontend y backend).
- **services/**: Servicios que interactúan con APIs externas, como `getProject.js` y `postRunLtm.js`.
- **auth/**: Módulo de autenticación para obtener `accessToken` para las pruebas.
- **reports/**: Carpeta para almacenar los reportes generados, tanto en HTML como en resúmenes de texto.
- **utils/**: Utilidades generales del proyecto, como `testsCache`.
- **ci/**: Archivos de configuración para integración continua con GitLab CI/CD.
- **docs/**: Documentación del proyecto, incluyendo este README y los logos.

## Instrucciones de Ejecución

### Scripts de Prueba

Se han definido scripts en el archivo **package.json** para facilitar la ejecución de las pruebas:

- **peakLoad**: Ejecuta la prueba de carga de pico.
- **stress**: Ejecuta la prueba de stress.
- **spike**: Ejecuta la prueba de pico rápido (spike).
- **soak**: Ejecuta la prueba de saturación prolongada (soak).
- **demoFront**: Ejecuta las pruebas de la interfaz de usuario frontend.

Ejemplo de ejecución de prueba:

```
npm run peakLoad
```

## Contacto y Colaboración

Para contribuir al proyecto o reportar problemas, por favor contacta al equipo de **Crowdar** o **Lippia** utilizando los canales oficiales.





