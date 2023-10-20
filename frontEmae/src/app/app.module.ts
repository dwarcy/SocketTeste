import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TopoComponent } from './topo/topo.component';
import { AgRemetenteComponent } from './ag-remetente/ag-remetente.component';
import { AgDestinatarioComponent } from './ag-destinatario/ag-destinatario.component';
import { ListaContatosComponent } from './lista-contatos/lista-contatos.component';
import { MostraChatComponent } from './mostra-chat/mostra-chat.component';

@NgModule({
  declarations: [
    AppComponent,
    TopoComponent,
    AgRemetenteComponent,
    AgDestinatarioComponent,
    ListaContatosComponent,
    MostraChatComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
