package persistencia;

import main.Sistema;

public class UtilSistema {
	
	public static SistemaDTO sistemaDTOfromSistema() {
		SistemaDTO copiaSist = new SistemaDTO();
		
		copiaSist.setAdmin(Sistema.getInstancia().getAdmin());
		copiaSist.setFacturas(Sistema.getInstancia().getFacturas());
		copiaSist.setMesas(Sistema.getInstancia().getMesas());
		copiaSist.setMozos(Sistema.getInstancia().getMozos());
		copiaSist.setNombre(Sistema.getInstancia().getNombre());
		copiaSist.setOperarios(Sistema.getInstancia().getOperarios());
		copiaSist.setProductos(Sistema.getInstancia().getProducto());
		copiaSist.setPromosFijas(Sistema.getInstancia().getPromosFijas());
		copiaSist.setPromosTemporales(Sistema.getInstancia().getPromosTemporales());
		copiaSist.setSueldo(Sistema.getInstancia().getSueldo());
		
		return copiaSist;
	}
	
	public static void sistemafromSistemaDTO(SistemaDTO sist) {
		Sistema sistema = Sistema.getInstancia();
		
		sistema.setAdmin(sist.getAdmin());
		sistema.setFacturas(sist.getFacturas());
		sistema.setMesas(sist.getMesas());
		sistema.setMozos(sist.getMozos());
		sistema.setNombre(sist.getNombre());
		sistema.setOperarios(sist.getOperarios());
		sistema.setProducto(sist.getProductos());
		sistema.setPromosFijas(sist.getPromosFijas());
		sistema.setPromosTemporales(sist.getPromosTemporales());
		sistema.setSueldo(sist.getSueldo());
		
	}

}
