import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-admin',
  templateUrl: './menu-admin.component.html',
  styleUrls: ['./menu-admin.component.css']
})
export class MenuAdminComponent implements OnInit {
  

  constructor(private router: Router) { }

  ngOnInit(): void {
    
  }
  irInventarios(){
    this.router.navigate(['admin/inventarios']);
  }
  
}