requirejs.config({
	paths: {
	        'Modernizr': 'foundation/js/vendor/modernizr'
	    },
	shim: {
	    'Modernizr': {exports: 'Modernizr'},
        'foundation/js/foundation' : [ 'jquery' ],
        'foundation/js/foundation/foundation.alert' : [ 'foundation/js/foundation','Modernizr' ]
    }
});

define([ "foundation/js/foundation/foundation.alert" ], function() {
    return function(spec) {
    	jQuery(document).foundation(spec.params);
    };
});
