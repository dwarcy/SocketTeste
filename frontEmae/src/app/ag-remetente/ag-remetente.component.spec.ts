import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgRemetenteComponent } from './ag-remetente.component';

describe('AgRemetenteComponent', () => {
  let component: AgRemetenteComponent;
  let fixture: ComponentFixture<AgRemetenteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AgRemetenteComponent]
    });
    fixture = TestBed.createComponent(AgRemetenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
