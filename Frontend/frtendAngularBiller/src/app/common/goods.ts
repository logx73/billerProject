export class Goods {
    constructor(
    public price: number,
    public weight: number,
    public amount: number,
    public advanceAmount: number,
    public checkNumber: bigint,
    public purchased: Date
    ){}

}
