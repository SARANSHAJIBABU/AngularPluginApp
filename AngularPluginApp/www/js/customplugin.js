var customplugin = {
    createEvent: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'CustomPlugin', // mapped to our native Java class called "CustomPlugin"
            'openActivity', // with this action name
            []
        ); 
    }
}
module.exports = customplugin;