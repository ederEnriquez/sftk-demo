var exec = require('cordova/exec');

exports.sayHelloMethod = function (arg0, success, error) {
    exec(success, error, 'SftkDemo', 'sayHelloMethod', [arg0]);
};
