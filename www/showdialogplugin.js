var exec = require('cordova/exec');

exports.showdialog = function ( success, error) {
    exec(success, error, 'showdialogplugin', 'showdialog', []);
};
