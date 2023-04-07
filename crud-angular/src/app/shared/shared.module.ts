import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import {AppMaterialModule} from "./app-material/app-material.module";
import { CategoriesPipe } from './pipes/categories.pipe';



@NgModule({
  declarations: [
    ErrorDialogComponent,
    CategoriesPipe
  ],
  imports: [
    CommonModule,
    AppMaterialModule
  ],
  exports:[
    ErrorDialogComponent,
    CategoriesPipe
  ]
})
export class SharedModule { }
