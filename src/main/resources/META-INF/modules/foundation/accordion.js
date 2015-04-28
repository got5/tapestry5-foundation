requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.accordion" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.accordion" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
