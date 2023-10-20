import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgDestinatarioComponent } from './ag-destinatario.component';

describe('AgDestinatarioComponent', () => {
  let component: AgDestinatarioComponent;
  let fixture: ComponentFixture<AgDestinatarioComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AgDestinatarioComponent]
    });
    fixture = TestBed.createComponent(AgDestinatarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
