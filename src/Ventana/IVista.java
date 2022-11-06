package Ventana;

public interface IVista {
	//Ventana login
	
	static final String confirmaLoginUsuario = "Confirma login de usuario";
	static final String confirmaLogoutUsuario = "Confirma logout de usuario";
	static final String guardaSistema = "Guardar sistema";
	static final String recuperaSistema = "Recupera sistema";
	static final String nuevoSistema = "Nuevo sistema";
	
	//Ventana general
	
	static final String confirmaEstadoMozoDia = "Confirmar el estado del mozo del dia";
	static final String asociaMozoAMesa = "Asocia mozo a una mesa";
	static final String ocupaMesa = "Ocupa mesa";
	static final String agregaPedido = "Agrega pedido a comanda";
	static final String cerrarComanda = "Cerrar comanda";
	
	//Ventana operarios y mesas
	
	static final String crearOperario = "Crear operario";
	static final String eliminarOperario = "Eliminar operario";
	static final String modificarOperario = "Modificar operario";
	static final String crearMesa = "Crear mesa";
	static final String eliminarMesa = "Eliminar mesa";
	static final String modificarMesa = "Modificar mesa";
	
	//Ventana promociones
	
	static final String crearPromPerm = "Crear promocion permanente";
	static final String eliminarPromPerm = "Eliminar promocion permanente";
	static final String modificarPromPerm = "Modificar promocion permanente";
	static final String crearPromTemp = "Crear promocion temporal";
	static final String eliminarPromTemp = "Eliminar promocion temporal";
	static final String modificarPromTemp = "Modificar promocion temporal";
	
	//Ventana mozos
	
	static final String crearMozo = "Crear mozo";
	static final String eliminarMozo = "Eliminar mozo";
	static final String modificarMozo = "Modificar mozo";
	static final String estadEmpleado = "Estadisticas de un empleado";
	static final String estadEmpleadoMayorVol = "Estadisticas de empleado con mayor volumen de venta";
	static final String estadEmpleadoMenorVol = "Estadisticas de empleado con menor volumen de venta";
	static final String estadPromMesas = "Estadisticas de consumo promedio por mesa";
	
	//Ventana Productos
	
	static final String crearProducto = "Crear producto";
	static final String eliminarProducto = "Eliminar producto";
	static final String modificarProducto = "Modificar producto";
	static final String actualizarStockProducto = "Actualizar stock de producto";
	
}
