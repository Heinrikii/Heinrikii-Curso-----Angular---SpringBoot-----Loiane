import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'categories'
})
export class CategoriesPipe implements PipeTransform {

  transform(value: string): string {
    switch (value){
      case 'Front-end': return 'code';
      case 'Back-end': return 'computer';
      case 'Cloud': return 'cloud';
      case 'DataBase': return 'storage';
      case 'Linguagem': return 'languagem';
    }
    return 'code';
  }

}
