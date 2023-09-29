import { Goods } from "./goods";

export class Metadata {
    constructor(
        public farmerId:number,
        public lastUpdated:Date,
        public status:string,
        public goodsList:Goods[]
    ){}
}
