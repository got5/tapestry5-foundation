requirejs.config({
    "shim" : {
    	 "foundation/js/foundation" : [ "jquery" ],
         "foundation/js/foundation/foundation.reveal" : [ "foundation/js/foundation" ]
    }
});
define([ "foundation/js/foundation/foundation.reveal" ], function() {
    return function(spec) {
        jQuery('#' + spec.div).addClass('reveal-modal');
        jQuery('#' + spec.div).attr('data-reveal','');

        jQuery(spec.id).click(function(e) {
            e.preventDefault();
            jQuery('#' + spec.div).foundation({reveal:{
                animation : spec.animation,
                animationspeed : spec.animationspeed,
                closeonbackgroundclick : spec.closeonbackgroundclick,
                dismissmodalclass : spec.dismissmodalclass
            }});
            jQuery('#' + spec.div).foundation('reveal','open');
           
        });
    };
});
