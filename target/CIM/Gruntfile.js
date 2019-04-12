"use strict";

module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
	jshint: {
		options: {
			jshintrc: '.jshintrc',
			reporter: require('jshint-stylish')
		},
		all: {
			src: [
				'Gruntfile.js',
				'src/js/*.js',
			]
		}
	},
    sass: {                              // Task 
		dist: {                            // Target 
		  options: {                       // Target options 
			style: 'expanded'
		  },
		  files: {                         
			'dist/css/style.css': 'src/scss/style.scss',       // 'destination': 'source' 
		  }
		},
		dark: {                            // Target 
		  options: {                       // Target options 
			style: 'expanded'
		  },
		  files: {                         
			'dist/css/style.css': 'src/scss/style-dark.scss',       // 'destination': 'source' 
		  }
		},
		rtl: {                            // Target 
		  options: {                       // Target options 
			style: 'expanded'
		  },
		  files: {                         
			'dist/css/style.css': 'src/scss/style-rtl.scss',       // 'destination': 'source' 
		  }
		},
		rtldark: {                            // Target 
		  options: {                       // Target options 
			style: 'expanded'
		  },
		  files: {                         
			'dist/css/style.css': 'src/scss/style-rtl-dark.scss',       // 'destination': 'source' 
		  }
		}
    },
	
	watch: {
        src: {
		files: ['src/scss/style.scss'],
            tasks: ['sass:dist'],
            options: {
                spawn: false,
				livereload: 12344
            }
        },
		darksrc: {
		files: ['src/scss/style-dark.scss'],
			tasks: ['sass:dark'],
			options: {
				spawn: false,
				livereload: 12345
			}
		}, 
		rtlsrc: {
		files: ['src/scss/style-rtl.scss'],
			tasks: ['sass:rtl'],
			options: {
				spawn: false,
				livereload: 12346
			}
		},
		rtldarksrc: {
		files: ['src/scss/style-rtl-dark.scss'],
			tasks: ['sass:rtldark'],
			options: {
				spawn: false,
				livereload: 12347
			}
		} 		
    },
	 connect: {
		server: {
		  options: {
			port: 9000,
			hostname: '0.0.0.0',
			base: '',
			open:true
		  }
		}
	},
	  
});

  // Load all plugins.
  grunt.loadNpmTasks('grunt-contrib-jshint');
  grunt.loadNpmTasks('grunt-contrib-sass');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-contrib-connect');
  
  // Register all Tasks.
  grunt.registerTask('default',  ['sass:dist','jshint:all','connect:server','watch:src']);
  grunt.registerTask('sass-compile',  ['sass:dist','jshint:all','connect:server','watch:src']);
  grunt.registerTask('sass-dark',  ['sass:dark','jshint:all','connect:server','watch:darksrc']);
  grunt.registerTask('sass-rtl',  ['sass:rtl','jshint:all','connect:server','watch:rtlsrc']);
  grunt.registerTask('sass-rtl-dark',  ['sass:rtldark','jshint:all','connect:server','watch:rtldarksrc']);
};