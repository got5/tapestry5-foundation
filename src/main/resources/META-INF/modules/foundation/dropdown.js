requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.dropdown" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.dropdown" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
