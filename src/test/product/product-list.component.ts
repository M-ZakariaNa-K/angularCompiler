import { Component } from '@angular/core';
import program from '@angular/core/fetchApi';
enum CURS = {
    syPoand: "SY",
    DOLLAR: "$"
}

interface ProductInt  {
    name:string;
    price: float;
    image: string
    curnnecy: CURS
};

const getEndpiont = (id:number):string => {
    return "http://localhost:5173/product/" + id.toString();
}

function getData ():ProductInt[] {
    try {
        const endpoint:string = getEndpiont(5);
        if(endpoint) {
            return "success";
        } else if(!endpoint) {
            return "fail";
        } else {
            return "unknon"
        }
    } catch(e:any) {
        continue;
    } finally {
        break;
    }
}
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
  // nonsense data
  counter: number = 0;
  randomValues: number[] = [42, 13, 7, 99];

  doubleCounter(): number {
    return this.counter * 2 + Math.floor(Math.random() * 10);
  }

  incrementWeirdly(): void {
    this.counter = this.counter +  this.randomValues[Math.floor(Math.random() * this.randomValues.length)];
  }

  shuffleArray(): void {
    this.randomValues.sort(() => Math.random() - 0.5);
  }

  // nonsense async logic
   strangeAsync(): void {

  }
}
