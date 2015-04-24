requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.topbar" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.topbar" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
