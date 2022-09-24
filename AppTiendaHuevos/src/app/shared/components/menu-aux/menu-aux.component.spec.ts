import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuAuxComponent } from './menu-aux.component';

describe('MenuAuxComponent', () => {
  let component: MenuAuxComponent;
  let fixture: ComponentFixture<MenuAuxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuAuxComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuAuxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
