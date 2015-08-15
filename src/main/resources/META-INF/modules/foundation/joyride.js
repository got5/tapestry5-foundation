requirejs.config({
    "shim" : {
        "foundation/js/foundation" : [ "jquery" ],
        "foundation/js/foundation/foundation.joyride" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.joyride" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    	jQuery(document).foundation('joyride', 'start');
    	
    };
});
