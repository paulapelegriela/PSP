Paso 1 — Configurar Git ------------------------------------------------------------

Para comprobar que Git está instalado en el ordenador se pone en el cmd un "git -v".
Para Configurar el nombre y correo electrónico en Git se usan los comandos git config --global user.name "[Paula]" y git config --global user.email "[paulapelegri011@gmail.com]".
Se comprueba posteriormente que la configuración se ha realizado correctamente con un git status.
Se muestra el nombre y la dirección de correo electrónico con un git config --global user.name y git config --global user.email.

Paso 2 — Crear un repositorio local -------------------------------------------------

Se crea una carpeta para trabajar en el ejercicio de Git desde el explorador de archivos o haciendo un mkdir en cmd.
Se Inicializa dicha carpeta como un repositorio Git usando el comando git init.
Luego se comprueba que Git reconoce correctamente el repositorio con un git status.

Paso 3 — Crear archivos -------------------------------------------------------------

Dentro del proyecto se crean varios archivos relacionados con la asignatura de Programación, desde el explorador de archivos mismo.
• README.md
• notas.txt

Paso 4 — Consultar el estado del repositorio ----------------------------------------

Se utiliza Git para comprobar el estado del repositorio después de crear los archivos con un git status.
Todos los archivos aparecen como archivos que todavía no están siendo controlados por
Git, ya que todavía no los hemos pasado de local a staging area.

Paso 5 — Primer commit --------------------------------------------------------------

Se añaden los archivos al área de preparación (staging area) con un git add . para globalizarlo o con el nombre del archivo si solo queremos añadir uno.
Comprueba que los archivos están preparados para realizar el commit (git status).
Se realiza el primer commit con un git commit -m "First commit".

Paso 6 — Realizar modificaciones ----------------------------------------------------
Se modifica el archivo notas.txt con un echo, añadiendo una línea que diga “Voy a sacar un 10”. --> echo "Voy a sacar un 10" >> notas.txt
Comprueba de nuevo el estado del repositorio.
Observa qué ha cambiado desde el último commit (con un git diff).

Paso 7 — Segundo commit -------------------------------------------------------------
Se Añaden los cambios al área de preparación (git add .) y se realiza un segundo commit (git commit -m "Segundo commit,contenido añadido al archivo notas.txt").

Paso 8 — Consultar el historial -----------------------------------------------------
Ahora se utiliza en comando git log para consultar el historial de commits.
Con esto se pueden ver los commits que se han realizado y sus mensajes.