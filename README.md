<html>
<head>
  <style>
    body {
      font-family: 'Montserrat', sans-serif;
      color: #4D598E;
    }
    h1, h2, h3, h4, h5, h6 {
      font-family: 'Montserrat', sans-serif;
      font-weight: 900;
      color: #87BB50;
    }
    .logo-container {
      display: flex;
      align-items: center;
      gap: 20px;
    }
    .logo {
      width: 150px;
    }
  </style>
</head>
<body>
  <div class="logo-container">
    <img src="docs/logo_crowdar.png" alt="Crowdar Logo" class="logo" />
    <img src="docs/logo_lippia.png" alt="Lippia Logo" class="logo" />
  </div>

  <h1>Test Manager Performance - Proyecto K6</h1>
  
  <h2>Estructura del Proyecto</h2>
  <p> La estructura del proyecto ha sido reorganizada de la siguiente manera:</p>

  <pre>
  project-root/
  ├── config/                         # Configuraciones generales del proyecto
  │   └── config.js
  ├── scenarios/                      # Scripts de escenarios de prueba
  │   ├── demoFront/              # Pruebas para la UI de Frontend
  │   │   └── demoFrontk6.js
  │   └── backend/                # Pruebas para la API y Backend
  │       ├── demok6.js
  ├── services/                       # Servicios que interactúan con la API o bases de datos
  │   ├── getProject.js
  │   ├── getProjectLtm.js
  │   └── postRunLtm.js
  ├── auth/                           # Módulo para autenticación
  │   └── token.js
  ├── reports/                        # Generación de reportes
  │   ├── html                    # Reportes en formato HTML
  │   └── summaries               # Resúmenes de ejecuciones de pruebas
  ├── utils/                          # Utilidades generales
  │   └── testsCache              # Almacenamiento de caché
  ├── docs/                           # Documentación del proyecto
  ├── package.json
  └── package-lock.json
  └── .gitlab-ci.yml
  └── README.md
  </pre>

  <h2>Descripción de Carpetas y Archivos</h2>
  <ul>
    <li><strong>config/</strong>: Contiene las configuraciones generales del proyecto, como los perfiles de prueba (peakLoad, stress, spike, soak).</li>
    <li><strong>scenarios/</strong>: Contiene scripts de prueba organizados por tipo (frontend y backend).</li>
    <li><strong>services/</strong>: Servicios que interactúan con APIs externas, como `getProject.js` y `postRunLtm.js`.</li>
    <li><strong>auth/</strong>: Módulo de autenticación para obtener `accessToken` para las pruebas.</li>
    <li><strong>reports/</strong>: Carpeta para almacenar los reportes generados, tanto en HTML como en resúmenes de texto.</li>
    <li><strong>utils/</strong>: Utilidades generales del proyecto, como `testsCache`.</li>
    <li><strong>ci/</strong>: Archivos de configuración para integración continua con GitLab CI/CD.</li>
    <li><strong>docs/</strong>: Documentación del proyecto, incluyendo este README y los logos.</li>
  </ul>

  <h2>Instrucciones de Ejecución</h2>
  <h3>Scripts de Prueba</h3>
  <p>Se han definido scripts en el archivo <strong>package.json</strong> para facilitar la ejecución de las pruebas:</p>
  <ul>
    <li><strong>peakLoad</strong>: Ejecuta la prueba de carga de pico.</li>
    <li><strong>stress</strong>: Ejecuta la prueba de stress.</li>
    <li><strong>spike</strong>: Ejecuta la prueba de pico rápido (spike).</li>
    <li><strong>soak</strong>: Ejecuta la prueba de saturación prolongada (soak).</li>
    <li><strong>demoFront</strong>: Ejecuta las pruebas de la interfaz de usuario frontend.</li>
  </ul>
  <p>Ejemplo de ejecución de prueba:</p>
  <pre>
  npm run peakLoad
  </pre>

  <h2>Contacto y Colaboración</h2>
  <p>Para contribuir al proyecto o reportar problemas, por favor contacta al equipo de <strong>Crowdar</strong> o <strong>Lippia</strong> utilizando los canales oficiales.</p>
</body>
</html>




