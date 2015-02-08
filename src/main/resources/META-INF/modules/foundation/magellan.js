requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.magellan" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.magellan" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
