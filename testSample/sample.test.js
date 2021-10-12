const sample = require('./sample');

test("2 + 5 = 7?", () => {
	expect(sample.add(2, 5)).toBe(7);
});

test.each([
	[2, 5, 7],
	[10, 20, 30],
	[4, 4, 8],
	[23, -1, 22],
])("a + b = c?", (l, r, sum) => {
	expect(sample.add(l, r)).toBe(sum);
});

test('return a user object', () => {
  expect(sample.getUser(1)).toEqual({
    id: 1,
    email: `user1@test.com`,
  });
});

test("number 0 is falsy but string 0 is truthy", () => {
  expect(0).toBeFalsy();
  expect("0").toBeTruthy();
});

test("array", () => {
  const colors = ["Red", "Yellow", "Blue"];
  expect(colors).toHaveLength(3);
  expect(colors).toContain("Yellow");
  expect(colors).not.toContain("Green");
});