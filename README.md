
# TDD

Learn Test-Driven Development: By Example

## Settings with Jest

- install jest with babel
	```sh
	npm init -y
	npm install -D jest @types/jest @babel/core @babel/preset-env
	```

- babel.config.json
	```sh
	{
	  "presets": ["@babel/preset-env"]
	}
	```

- jest.config.json
	```sh
	{
	  "collectCoverage": true,
	  "moduleFileExtensions": ["js", "mjs"],
	  "transform": {
	    "^.+\\.js$": "babel-jest",
	    "^.+\\.mjs$": "babel-jest"
	  },
	  "testRegex": "((\\.|/*.)(test))\\.js?$"
	}
	```

- package.json
	```sh
	{
	  "scripts": {
	    "test": "jest"
		},
	}
	```

## Run

- Run all test suites
	```sh
	npm test
	```

