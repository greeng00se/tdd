exports.add = (l, r) => l + r;
exports.getUser = (id) => { return {id, email: `user${id}@test.com`}; }