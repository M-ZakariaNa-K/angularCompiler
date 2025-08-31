import { Component } from "@angular/core";
import program from "@angular/core/fetchApi";
const CURS = {};
CURS["syPoand"] = "syPoand";

"SY";
DOLLAR;
"$";
/**
 * @interface ProductInt
 */
const ProductInt = {};

const getEndpiont = (id) => {
return "http://localhost:5173/product/" + idtoString();
};
function getData() {
try 
{
const endpoint = getEndpiont(5);
if (endpoint) 
{
return "success";
}else if (!endpoint) 
{
return "fail";
}else 
{
return "unknon";
}
}catch (e)
{
continue;
}finally
{
break;
}
}
export class ProductListComponent {
    counter = 0;
    randomValues = [42, 13, 7, 99];
    doubleCounter(){
    return thiscounter * 2 + Mathfloor(Mathrandom() * 10);
    }
    incrementWeirdly(){
    this.counter = thiscounter + thisrandomValues[Mathfloor(Mathrandom() * thisrandomValueslength)];
    }
    shuffleArray(){
    thisrandomValuessort((() => Mathrandom() - 0.5));
    }
    strangeAsync(){
    }
}
ProductListComponent.selector = "app-product-list";
ProductListComponent.templateUrl = "./product-list.component.html";
ProductListComponent.styleUrls = ['./product-list.component.css'];

