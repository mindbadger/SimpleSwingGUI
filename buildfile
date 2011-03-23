
require 'build_version_numbers'
require 'build_dependencies'

StandardLayout = Layout.new
StandardLayout[:source, :main, :java] = 'src'
StandardLayout[:target, :main, :classes] = 'classes'
StandardLayout[:source, :test, :java] = 'test'
StandardLayout[:source, :test, :resources] = 'test'
StandardLayout[:target, :test, :classes] = 'test-classes'

define 'SimpleSwingGUI', :layout=>StandardLayout do
  project.version = VERSION_NUMBER
  project.group = 'mindbadger.bdd'
  
  #compile('src')
  
  #test('test').with(JUNIT, JBEHAVE, SWING_JBEHAVE)
  test.with(JUNIT, JBEHAVE, SWING_JBEHAVE, COMMONS_COLLECTIONS, FREEMARKER, COMMONS_LANG, COMMONS_IO, HAMCREST)
  
  pack = package(:jar)  
end
