export default class Money {
	constructor(value, currency) {
		this._amount = value;
		this._currency = currency;
	}
	
	equals(object) {
		return this._amount == object._amount && this.getCurrency() == object.getCurrency();
	}
	
	times(multiplier) {
		return new Money(this._amount * multiplier, this.getCurrency());
	}
	
	getCurrency() {
		return this._currency;
	}
	
	static dollar(value) {
		return new Money(value, 'USD');
	}
	
	static won(value) {
		return new Money(value, 'KRW');
	}
}