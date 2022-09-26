import { environment } from '@env'

const BASE_API = environment.api;

export const APILOGIN_URL= BASE_API + '/login';
export const APIMOSTRARPRODUCTOS_URL= BASE_API + '/mostrar-productos';