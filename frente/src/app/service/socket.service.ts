import { Injectable } from '@angular/core';
//@ts-ignore
import io from 'socket.io-client'

@Injectable({
  providedIn: 'root'
})
export class SocketService {

  socket = io('http://localhost:4001', { transports: ['polling','websocket'] })

  constructor() {} 



}
