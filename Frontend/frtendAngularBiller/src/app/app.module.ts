import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FarmerListComponent } from './components/farmer-list/farmer-list.component';
import { HttpClientModule } from '@angular/common/http';
import { FarmerService } from './services/farmer.service';
import { PattiComponent } from './components/patti/patti.component';
import { FormsModule, ReactiveFormsModule, FormArray, Validators } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    FarmerListComponent,
    PattiComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [FarmerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
