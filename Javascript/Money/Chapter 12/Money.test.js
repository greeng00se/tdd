import Expression from './Expression.js';
import Money from './Money.js';
import Bank from './Bank.js';

test('Test Multiplication', () => {
	let five = Money.dollar(5)
  expect(five.times(2)).toEqual(Money.dollar(10));
	expect(five.times(3)).toEqual(Money.dollar(15));
});

test('Test Won Multiplication', () => {
	let five = Money.won(5)
  expect(five.times(2)).toEqual(Money.won(10));
	expect(five.times(3)).toEqual(Money.won(15));
});

test('Test Equality', () => {
	expect(Money.dollar(5).equals(Money.dollar(5))).toBeTruthy();
	expect(Money.dollar(5).equals(Money.dollar(6))).toBeFalsy();
	expect(Money.won(5).equals(Money.dollar(5))).toBeFalsy();
});

test('Test Currency', () => {
	expect(Money.dollar(1).getCurrency()).toEqual('USD');
	expect(Money.won(1).getCurrency()).toEqual('KRW');
})

test('Simple Addition', () => {
	let five = Money.dollar(5);
	let sum = five.plus(five);
	let bank = new Bank();
	let reduced = bank.reduce(sum, 'USD');
	expect(reduced).toEqual(Money.dollar(10));
})