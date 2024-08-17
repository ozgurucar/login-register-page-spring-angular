import { Component } from '@angular/core';
import {RegistrationRequest} from "../../app/services/models/registration-request";
import {CommonModule, NgForOf, NgIf} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {register} from "../../app/services/fn/authentication/register";
import {Router} from "@angular/router";
import {AuthenticationService} from "../../app/services/services/authentication.service";
import {TokenService} from "../../app/services/token/token.service";

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [
    NgForOf,
    NgIf,
    ReactiveFormsModule,
    CommonModule,
    FormsModule
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {

  registerRequest: RegistrationRequest = {email:'', firstName:'',lastName:'', password:''};

  errorMsg: Array<String> = [];

  protected readonly register = register;

  constructor(
    private router:Router,
    private authService: AuthenticationService
  ) {
  }

  registration() {
  this.errorMsg = []
    this.authService.register({
      body: this.registerRequest
    }).subscribe({
      next: () => {
        this.router.navigate(['activate-account']);
      },
      error: (err) => {
        this.errorMsg = err.error.validationErrors;
      }
    })
  }

  login() {
    this.router.navigate(['login'])
  }
}
