/*******************************************************************************
 * Copyright (c) 2015 Halcyon Technologies.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Affero GNU Public License
 *   which accompanies this distribution, and is available at
 *   https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   Copyright:
 *       Halcyon Technologies llc
 *   
 *   This file is part of the Business Suite software of Halcyonpro.net.
 *   Copyright (C) 2012-2020 Halcyonpro.net
 *  
 *   The primary contact email is support@halcyonpro.net
 *  
 *   Version: AGPL
 *  
 *   Halcyon Technologies, Halcyon Information Systems, Halcyonpro along with their domain names,  
 *   etc and the names Acuity, Ingenuity, Derivo, Colander etc are copyright of
 *   Halcyon llc and usage of these without prior permission of the owner is strictly prohibited
 *    
 *  The contents of this file may be used under the terms of
 *   the Affero GNU General Public License Version (the "AGPL"),
 *   A copy of the AGPL v2.1 can be obtained from https://en.wikipedia.org/wiki/Affero_General_Public_License
 *   
 *   AGPL, in essence, means that this software requires a commercial license for use in or as a commercial application
 *******************************************************************************/
$.widget( "metro.clock" , {

    version: "1.0.0",

    options: {
        format: '24',
        showSeconds: true,
        showDate: false,
        dateFormat: 'american'
    },

    _create: function () {
        var that = this, element = this.element, o = this.options;

        this._setOptionsFromDOM();

        this._createClock();

        element.data('clock', this);
    },

    _tick: function(){
        var that = this, element = this.element, o = this.options;
        var current_time = new Date();

        var h = current_time.getHours(),
            m = current_time.getMinutes(),
            s = current_time.getSeconds(),
            dy = current_time.getDay(),
            dt = current_time.getDate(),
            mo = current_time.getMonth() + 1,
            y = current_time.getFullYear(),
            ap = "";

        if (o.format == "12") {
            ap = " AM";
            if (h > 11) { ap = " PM"; }
            if (h > 12) { h = h - 12; }
            if (h == 0) { h = 12; }
        }

        h = this._leadZero(h);
        m = this._leadZero(m);
        s = this._leadZero(s);

        dy = this._leadZero(dt);
        mo = this._leadZero(mo);

        var ddd, result = "";

        if (o.dateFormat == 'american') {
            ddd = y+"-"+mo+"-"+dy;
        } else {
            ddd = dy+"-"+mo+"-"+y;
        }

        if (o.showDate) {
            result += ddd;
        }

        result += "<span></span> <span class='hour'>"+h+"</span>:<span class='minute'>"+m+"</span>";

        if (o.showSeconds) {
            result += ":<span class='second'>"+s+"</span>";
        }

        result += "<span class='ap'>"+ap+"</span>";

        element.html(result);
    },

    _leadZero: function(i){
        return i < 10 ? "0" + i : i;
    },

    _createClock: function(){
        var that = this, element = this.element, o = this.options;

        element.addClass('clock');

        this._tick();

        this._clockInterval = setInterval(function(){
            that._tick();
        }, 1000);
    },

    _setOptionsFromDOM: function(){
        var that = this, element = this.element, o = this.options;

        $.each(element.data(), function(key, value){
            if (key in o) {
                try {
                    o[key] = $.parseJSON(value);
                } catch (e) {
                    o[key] = value;
                }
            }
        });
    },

    _destroy: function () {
        clearInterval(this._clockInterval);
    },

    _setOption: function ( key, value ) {
        this._super('_setOption', key, value);
    }
});
