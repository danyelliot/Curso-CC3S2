#
# Cookbook Name:: tomcat
# Recipe:: default
#
# Copyright 2010, Opscode, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

include_recipe "java"

tomcat_pkgs =  ["tomcat7","tomcat7-admin"]

tomcat_pkgs.each do |pkg|
  package pkg do
    action :install
  end
end

service "tomcat" do
  service_name "tomcat7"
  supports :restart => true, :reload => true, :status => true
  action [:enable, :start]
end

template "/etc/default/tomcat7" do
  source "default_tomcat7.erb"
  owner "root"
  group "root"
  mode "0644"
  notifies :restart, resources(:service => "tomcat")
end

template "/etc/tomcat7/server.xml" do
  source "server.xml.erb"
  owner "root"
  group "root"
  mode "0644"
  notifies :restart, resources(:service => "tomcat")
end
