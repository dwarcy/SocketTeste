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

  public infoJson: object = {
    "clientId": 100,
    "nome": "Jose",
    "message": "Mensagem do Usuário Jose",
  }

  constructor(private teste: SocketService) {}

  ngOnInit() {

    const jsonString = JSON.stringify(this.infoJson)

    this.teste.connectToServer({ json: jsonString })

  }

  public conectaCliente(): void {

    this.teste.emit('emiteMensagem', "Mensagem Enviada do Cliente", (responde: any) => {
      console.log(responde)
    })

  }

}
