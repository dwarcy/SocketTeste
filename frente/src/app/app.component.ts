import { Component } from '@angular/core';
import { Socket } from 'ngx-socket-io';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  constructor(private socket: Socket) {

    let texto: string = "teste de string de mensagem a ser enviada aaaaa "
    
    // fica aguardando alguma mensagem enviada do server
    this.socket.on('message', (data:any) => {
      console.log(data)
    })

  }

}
