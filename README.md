# TDD

환경설정
npm init -y
# jest를 설치하면 babel-jest가 자동 설치된다.
npm install -D jest @types/jest @babel/core @babel/preset-env

babel.config.json
{
  "presets": ["@babel/preset-env"]
}

jest.config.json
{
  "collectCoverage": true,
  "moduleFileExtensions": ["js", "mjs"],
  "transform": {
    "^.+\\.js$": "babel-jest",
    "^.+\\.mjs$": "babel-jest"
  },
  "testRegex": "((\\.|/*.)(test))\\.js?$"
}

package.json
{
	"scripts": {
		"test": "jest"
	},
}