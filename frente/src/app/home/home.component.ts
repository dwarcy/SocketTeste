import { Component, ɵɵsetComponentScope } from '@angular/core';
//@ts-ignore
import { io } from 'socket.io-client';
import { SocketService } from '../service/socket.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {

  public teste: SocketService = new SocketService

  constructor() {
    //console.log("OLA TESTE")
  }

  ngOnInit() {

    //this.conectaCliente()

  }


  public conectaCliente(): void {

    this.teste.socket.emit('emiteMensagem', "Ola. Mensagem enviada do Cliente", (response: string) => {
      console.log(response)
    })

  }

}
