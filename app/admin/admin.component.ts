import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { Router } from '@angular/router';
import { RegistrationService } from '../services/registration.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  ad= new Admin()

  message=""
  constructor(private router: Router,private service: RegistrationService) { }

  ngOnInit(): void {
  }

  loginadmin(){
   this.service.loginAdmin(this.ad).subscribe(data=> (this.router.navigate(['adminwelcome']),
    console.log("Response Recieved")),
  err=>//console.log("Exception occoured")
  this.message="Bad Cresentials... Enter Valid Details");

  }

}
