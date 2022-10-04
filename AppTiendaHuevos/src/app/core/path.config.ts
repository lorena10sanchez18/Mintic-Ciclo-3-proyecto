import { environment } from '@env'

const BASE_API = environment.api;

export const APILOGIN_URL= BASE_API + '/login';
export const APIMOSTRARPRODUCTOS_URL= BASE_API + '/mostrar-productos';
export const APIMOSTRARBODEGAS_URL= BASE_API + '/mostrar-bodegas';
export const APIMOSTRARMOTIVOS_URL= BASE_API + '/mostrar-motivos';
export const APIINSERTARAJUSTESINVENTARIO_URL= BASE_API + '/insertar-ajuste-inventario';
export const APICREARPRODUCTO_URL= BASE_API + '/insertar-producto';
export const APICREARUSUARIO_URL= BASE_API + '/insertar-usuarios';
export const APIACTUALIZARUSUARIO_URL= BASE_API + '/actualizar-usuario';
export const APIBUSCARPRODUCTOPORNOMBRE_URL= BASE_API + '/mostrar-producto-por-nombre/';
export const APIACTUALIZARVALORPRODUCTO_URL= BASE_API + '/actualizar-valor-producto';
export const APIBUSCARUSUARIO_URL = BASE_API + '/buscar-usuario-cedula';
export const APIINGRESOSPRODUCTO_URL = BASE_API + '/insertar-ingresos-bodega';
export const APITRASLADOSPRODUCTO_URL = BASE_API + '/traslados-producto';
export const APIMOSTRARUBICACIONES_URL = BASE_API + '/mostrar-ubicaciones';


export const APITOTALVALORVENTAS_URL= BASE_API + '/admin/total-ventas';
export const APIVENTASPORFECHA_URL= BASE_API + '/admin/ventas';

