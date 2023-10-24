import { Injectable } from '@angular/core';
//@ts-ignore
import { Socket } from 'socket.io-client';
//@ts-ignore
import * as io from 'socket.io-client';

@Injectable({
  providedIn: 'root'
})
export class SocketService {

  //socket = io('http://localhost:4001', { query },{ transports: ['polling','websocket'] })
  socket: Socket; 

  constructor() {} 

  connectToServer(query: any = {}): void {
    this.socket = io('http://localhost:4001', { query })
  }

  public emit(event: string, data:any, response:any): void {
    this.socket.emit(event,data)
  }

}
