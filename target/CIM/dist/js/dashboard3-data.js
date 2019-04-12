/*Dashboard3 Init*/
 
"use strict"; 

/*****Ready function start*****/
$(document).ready(function(){
	$('#support_table').DataTable({
		"bFilter": false,
		"bLengthChange": false,
		"bPaginate": false,
		"bInfo": false,
	});
	if( $('#chart_7').length > 0 ){
		var ctx7 = document.getElementById("chart_7").getContext("2d");
		var data7 = {
			 labels: [
			"Low",
			"Medium",
			"High"
		],
		datasets: [
			{
				data: [300, 100, 50],
				backgroundColor: [
					"rgba(1,200,83,1)",
					"rgba(254,193,7,1)",
					"rgba(255,42,0,1)"
				],
				hoverBackgroundColor: [
					"rgba(1,200,83,1)",
					"rgba(254,193,7,1)",
					"rgba(255,42,0,1)"
				]
			}]
		};
		
		var doughnutChart = new Chart(ctx7, {
			type: 'doughnut',
			data: data7,
			options: {
				animation: {
					duration:	2000
				},
				responsive: true,
				maintainAspectRatio:false,
				legend: {
					labels: {
					fontFamily: "Roboto",
					fontColor:"#878787"
					}
				},
				elements: {
					arc: {
						borderWidth: 0
					}
				},
				tooltip: {
					backgroundColor:'rgba(33,33,33,1)',
					cornerRadius:0,
					footerFontFamily:"'Roboto'"
				}
			}
		});
	}
	if( $('#chart_6').length > 0 ){
		var ctx6 = document.getElementById("chart_6").getContext("2d");
		var data6 = {
			 labels: [
			"Completed",
			"Delayed",
			"Overdue",
			"Not Started"
		],
		datasets: [
			{
				data: [300, 50, 100,70],
				backgroundColor: [
					"rgba(1,200,83,1)",
					"rgba(254,193,7,1)",
					"rgba(255,42,0,1)",
					"rgba(233,30,99,1)"
				],
				hoverBackgroundColor: [
					"rgba(1,200,83,1)",
					"rgba(254,193,7,1)",
					"rgba(255,42,0,1)",
					"rgba(233,30,99,1)"
				]
			}]
		};
		
		var pieChart  = new Chart(ctx6,{
			type: 'pie',
			data: data6,
			options: {
				animation: {
					duration:	3000
				},
				responsive: true,
				maintainAspectRatio:false,
				legend: {
					labels: {
					fontFamily: "Roboto",
					fontColor:"#878787"
					}
				},
				tooltip: {
					backgroundColor:'rgba(33,33,33,1)',
					cornerRadius:0,
					footerFontFamily:"'Roboto'"
				},
				elements: {
					arc: {
						borderWidth: 0
					}
				}
			}
		});
	}
	
	if($('#morris_extra_bar_chart').length > 0)
		// Morris bar chart
		Morris.Bar({
			element: 'morris_extra_bar_chart',
			data: [{
				y: '2006',
				a: 100,
				b: 90,
				c: 60
			}],
			xkey: 'y',
			ykeys: ['a', 'b', 'c'],
			labels: ['A', 'B', 'C'],
			barColors:['#fec107', '#ff2a00', '#2879ff'],
			hideHover: 'auto',
			gridLineColor: '#878787',
			resize: true,
			barGap:7,
			gridTextColor:'#878787',
			gridTextFamily:"Roboto"
		});

});
/*****Ready function end*****/

/*****Load function start*****/
$(window).load(function(){
	window.setTimeout(function(){
		$.toast({
			heading: 'Welcome to Hound',
			text: 'Use the predefined ones, or specify a custom position object.',
			position: 'top-right',
			loaderBg:'#fec107',
			icon: 'success',
			hideAfter: 3500, 
			stack: 6
		});
	}, 3000);
});
/*****Load function* end*****/

/*****Sparkline function start*****/
var sparklineLogin = function() { 
		if( $('#sparkline_4').length > 0 ){
			$("#sparkline_4").sparkline([2,4,4,6,8,5,6,4,8,6,6,2 ], {
				type: 'line',
				width: '100%',
				height: '45',
				lineColor: '#fec107',
				fillColor: '#fec107',
				maxSpotColor: '#fec107',
				highlightLineColor: 'rgba(0, 0, 0, 0.2)',
				highlightSpotColor: '#fec107'
			});
		}	
	}
	var sparkResize;
/*****Sparkline function end*****/

$(window).resize(function(e) {
	clearTimeout(sparkResize);
	sparkResize = setTimeout(sparklineLogin, 200);
});
sparklineLogin();