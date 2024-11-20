import sqlite3
from sqlite3 import Connection, OperationalError

class DatabaseConfig:
    _instance = None
    _connection = None

    # Ruta de la base de datos SQLite
    DATABASE_PATH = "mi_base_de_datos.db"

    # Constructor privado
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(DatabaseConfig, cls).__new__(cls)
            cls._instance._connect()
        return cls._instance

    # Método para conectar a la base de datos
    def _connect(self):
        try:
            self._connection = sqlite3.connect(self.DATABASE_PATH)
            print("Conexión establecida exitosamente.")
        except OperationalError as e:
            print(f"Error al conectar a la base de datos: {e}")

    # Método para obtener la conexión (reconectar si está cerrada)
    def get_connection(self) -> Connection:
        try:
            if self._connection is None:
                self._connect()
            return self._connection
        except OperationalError as e:
            print(f"Error al obtener la conexión: {e}")
            return None

    # Método para cerrar la conexión
    def close_connection(self):
        if self._connection:
            self._connection.close()
            self._connection = None
            print("Conexión cerrada exitosamente.")
