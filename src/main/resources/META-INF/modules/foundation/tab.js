requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.tab" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.tab" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
