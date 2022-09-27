import { environment } from '@env'

const BASE_API = environment.api;

export const APILOGIN_URL= BASE_API + '/login';
export const APIMOSTRARPRODUCTOS_URL= BASE_API + '/mostrar-productos';
export const APIMOSTRARBODEGAS_URL= BASE_API + '/mostrar-bodegas';
export const APIMOSTRARMOTIVOS_URL= BASE_API + '/mostrar-motivos';
export const APIINSERTARAJUSTESINVENTARIO_URL= BASE_API + '/insertar-ajuste-inventario';

