/*Dashboard Init*/

"use strict";
/*****Ready function start*****/
$(document).ready(function () {
    $('#statement').DataTable({
        "bFilter": false,
        "bLengthChange": false,
        "bPaginate": false,
        "bInfo": false,
    });
    if ($('#chart_2').length > 0) {
        var ctx2 = document.getElementById("chart_2").getContext("2d");
        var data2 = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
                {
                    label: "My First dataset",
                    backgroundColor: "rgba(254,193,7,1)",
                    borderColor: "rgba(254,193,7,1)",
                    data: [10, 30, 80, 61, 26, 75, 40]
                },
                {
                    label: "My Second dataset",
                    backgroundColor: "rgba(255,42,0,1)",
                    borderColor: "rgba(255,42,0,1)",
                    data: [28, 48, 40, 19, 86, 27, 90]
                },
                {
                    label: "My Third dataset",
                    backgroundColor: "rgba(1,200,83,1)",
                    borderColor: "rgba(1,200,83,1)",
                    data: [8, 28, 50, 29, 76, 77, 40]
                }
            ]
        };

        var hBar = new Chart(ctx2, {
            type: "horizontalBar",
            data: data2,

            options: {
                tooltips: {
                    mode: "label"
                },
                scales: {
                    yAxes: [{
                        stacked: true,
                        gridLines: {
                            color: "#878787",
                        },
                        ticks: {
                            fontFamily: "Roboto",
                            fontColor: "#878787"
                        }
                    }],
                    xAxes: [{
                        stacked: true,
                        gridLines: {
                            color: "#878787",
                        },
                        ticks: {
                            fontFamily: "Roboto",
                            fontColor: "#878787"
                        }
                    }],

                },
                elements: {
                    point: {
                        hitRadius: 40
                    }
                },
                animation: {
                    duration: 3000
                },
                responsive: true,
                maintainAspectRatio: false,
                legend: {
                    display: false,
                },

                tooltip: {
                    backgroundColor: 'rgba(33,33,33,1)',
                    cornerRadius: 0,
                    footerFontFamily: "'Roboto'"
                }

            }
        });
    }
    if ($('#chart_6').length > 0) {
        var ctx6 = document.getElementById("chart_6").getContext("2d");
        var data6 = {
            labels: [
                "organic",
                "Referral",
                "Other"
            ],
            datasets: [
                {
                    data: [200, 50, 250],
                    backgroundColor: [
                        "#2879ff",
                        "#01c853",
                        "#fec107",
                    ],
                    hoverBackgroundColor: [
                        "#2879ff",
                        "#01c853",
                        "#fec107",
                    ]
                }]
        };

        var pieChart = new Chart(ctx6, {
            type: 'pie',
            data: data6,
            options: {
                animation: {
                    duration: 3000
                },
                responsive: true,
                maintainAspectRatio: false,
                legend: {
                    display: false
                },
                tooltip: {
                    backgroundColor: 'rgba(33,33,33,1)',
                    cornerRadius: 0,
                    footerFontFamily: "'Roboto'"
                },
                elements: {
                    arc: {
                        borderWidth: 0
                    }
                }
            }
        });
    }
    if ($('#morris_extra_line_chart').length > 0) {
        var data = [{
            period: 'Son',
            iphone: 50,
            ipad: 80,
            itouch: 20
        }, {
            period: 'Mon',
            iphone: 130,
            ipad: 100,
            itouch: 80
        }, {
            period: 'Tue',
            iphone: 80,
            ipad: 60,
            itouch: 70
        }, {
            period: 'Wed',
            iphone: 70,
            ipad: 200,
            itouch: 140
        }, {
            period: 'Thu',
            iphone: 180,
            ipad: 150,
            itouch: 140
        }, {
            period: 'Fri',
            iphone: 105,
            ipad: 100,
            itouch: 80
        },
            {
                period: 'Sat',
                iphone: 250,
                ipad: 150,
                itouch: 200
            }];
        var dataNew = [{
            period: 'Jan',
            iphone: 10,
            ipad: 60,
            itouch: 20
        },
            {
                period: 'Feb',
                iphone: 110,
                ipad: 100,
                itouch: 80
            },
            {
                period: 'March',
                iphone: 120,
                ipad: 100,
                itouch: 80
            },
            {
                period: 'April',
                iphone: 110,
                ipad: 100,
                itouch: 80
            },
            {
                period: 'May',
                iphone: 170,
                ipad: 100,
                itouch: 80
            },
            {
                period: 'June',
                iphone: 120,
                ipad: 150,
                itouch: 80
            },
            {
                period: 'July',
                iphone: 120,
                ipad: 150,
                itouch: 80
            },
            {
                period: 'Aug',
                iphone: 190,
                ipad: 120,
                itouch: 80
            },
            {
                period: 'Sep',
                iphone: 110,
                ipad: 120,
                itouch: 80
            },
            {
                period: 'Oct',
                iphone: 10,
                ipad: 170,
                itouch: 10
            },
            {
                period: 'Nov',
                iphone: 10,
                ipad: 470,
                itouch: 10
            },
            {
                period: 'Dec',
                iphone: 30,
                ipad: 170,
                itouch: 10
            }
        ];
        var lineChart = Morris.Line({
            element: 'morris_extra_line_chart',
            data: data,
            xkey: 'period',
            ykeys: ['iphone', 'ipad', 'itouch'],
            labels: ['iphone', 'ipad', 'itouch'],
            pointSize: 2,
            fillOpacity: 0,
            lineWidth: 2,
            pointStrokeColors: ['#fec107', '#e91e63', '#2879ff'],
            behaveLikeLine: true,
            gridLineColor: '#878787',
            hideHover: 'auto',
            lineColors: ['#fec107', '#e91e63', '#2879ff'],
            resize: true,
            redraw: true,
            gridTextColor: '#878787',
            gridTextFamily: "Roboto",
            parseTime: false
        });

    }
    /* Switchery Init*/
    var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));
    $('#morris_switch').each(function () {
        new Switchery($(this)[0], $(this).data());
    });
    var swichMorris = function () {
        if ($("#morris_switch").is(":checked")) {
            lineChart.setData(data);
            lineChart.redraw();
        } else {
            lineChart.setData(dataNew);
            lineChart.redraw();
        }
    }
    swichMorris();
    $(document).on('change', '#morris_switch', function () {
        swichMorris();
    });

});
/*****Ready function end*****/

/*****Load function start*****/
$(window).load(function () {
    if (flag==0) {
        window.setTimeout(function () {
            $.toast({
                heading: '尊敬的:' + zzgms + '-- 欢迎您登陆!',
                text: '祝您工作愉快!ヾ(◍°∇°◍)ﾉﾞ(～￣▽￣)～ ',
                position: 'top-right',
                loaderBg: '#fec107',
                icon: 'success',
                hideAfter: 35000,
                stack: 6
            });
        }, 3000);
    }
});
/*****Load function* end*****/

var sparklineLogin = function () {
    if ($('#sparkline_1').length > 0) {
        $("#sparkline_1").sparkline([2, 4, 4, 6, 8, 5, 6, 4, 8, 6, 6, 2], {
            type: 'line',
            width: '100%',
            height: '35',
            lineColor: '#2879ff',
            fillColor: 'rgba(40,121,255,.2)',
            maxSpotColor: '#2879ff',
            highlightLineColor: 'rgba(0, 0, 0, 0.2)',
            highlightSpotColor: '#2879ff'
        });
    }
    if ($('#sparkline_2').length > 0) {
        $("#sparkline_2").sparkline([0, 2, 8, 6, 8], {
            type: 'line',
            width: '100%',
            height: '35',
            lineColor: '#2879ff',
            fillColor: 'rgba(40,121,255,.2)',
            maxSpotColor: '#2879ff',
            highlightLineColor: 'rgba(0, 0, 0, 0.2)',
            highlightSpotColor: '#2879ff'
        });
    }
    if ($('#sparkline_3').length > 0) {
        $("#sparkline_3").sparkline([0, 23, 43, 35, 44, 45, 56, 37, 40, 45, 56, 7, 10], {
            type: 'line',
            width: '100%',
            height: '35',
            lineColor: '#2879ff',
            fillColor: 'rgba(40,121,255,.2)',
            maxSpotColor: '#2879ff',
            highlightLineColor: 'rgba(0, 0, 0, 0.2)',
            highlightSpotColor: '#2879ff'
        });
    }
    if ($('#sparkline_4').length > 0) {
        $("#sparkline_4").sparkline([0, 2, 8, 6, 8, 5, 6, 4, 8, 6, 6, 2], {
            type: 'bar',
            width: '100%',
            height: '50',
            barWidth: '5',
            resize: true,
            barSpacing: '5',
            barColor: '#fec107',
            highlightSpotColor: '#fec107'
        });
    }
}
var sparkResize;
$(window).resize(function (e) {
    clearTimeout(sparkResize);
    sparkResize = setTimeout(sparklineLogin, 200);
});
sparklineLogin();