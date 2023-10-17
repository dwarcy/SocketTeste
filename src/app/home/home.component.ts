import { Component } from '@angular/core';
import { Socket } from 'ngx-socket-io';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private socket: Socket) {
    
    // fica aguardando alguma mensagem enviada do server
    this.socket.on('event', (data:any) => {
      console.log(data)
    })

    // envia um evento para o server
    this.socket.emit('message', { some: 'mensagem enviada pro server' })

  }

}
