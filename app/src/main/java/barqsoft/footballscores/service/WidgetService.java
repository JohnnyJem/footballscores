/***
  Copyright (c) 2008-2012 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
  
  From _The Busy Coder's Guide to Android Development_
    http://commonsware.com/Android
*/

package barqsoft.footballscores.service;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService {
  /*
  You are passed in an Intent, the one
  used in the setRemoteAdapter() call.
   */
  @Override
  public RemoteViewsFactory onGetViewFactory(Intent intent) {
    /*
    Google has suggested using getApplicationContext()
    here to supply the Context object
    to RemoteViewsFactory, instead of using the Service
    as a Context, though it is unclear why this is
     */
    return(new WidgetFutbolViewsFactory(this.getApplicationContext(), intent));
  }
}